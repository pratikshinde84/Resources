import React, { useState, useEffect } from "react";
import "./index.css";

function App() {
  const [category, setCategory] = useState("home");
  const [search, setSearch] = useState("");
  const [dark, setDark] = useState(false);

  useEffect(() => {
    document.body.className = dark ? "dark" : "";
  }, [dark]);

  const data = {
    home: [
      {
        title: "📂 Master Drive",
        link: "https://drive.google.com/drive/folders/13bI4Ko4znysfA3s4oWpFjpPKzA_Q_4fX?usp=sharing"
      }
    ],

    company: [
      { title: "TCS Ninja Roadmap 🚀", link: "https://drive.google.com/file/d/1nPN01XDICUyuHRHJckzZPMN_25Am6Sir/view?usp=drivesdk" },
      { title: "TCS Digital Roadmap 🚀", link: "https://drive.google.com/file/d/1SxxOmnwneqEzpWn2ZS9ySu4BlfUHrjfw/view?usp=drivesdk" },
      { title: "Infosys Placement Bundle", link: "https://drive.google.com/drive/folders/16WWF8fq86ERYh7f4npFTGFVaxYM-ZFjh" },
      { title: "All Companies Placement Drive 🔥", link: "https://drive.google.com/drive/folders/1NC5wLHUMUye5_5zHzSgTgXDUdVmh43ZU" },
      { title: "Accenture Placement Drive 🔥", link: "https://drive.google.com/drive/folders/14KY-N173ZGD3P-1PsceLAAl6mf0xplk_" },
      { title: "All Companies Placement Guide", link: "https://drive.google.com/drive/folders/1ioTB5e5NGQUSh2J9yUFHRjn3Mo-sPL5d" },
      { title: "3 Month Data Science Roadmap", link: "https://drive.google.com/file/d/14L5cBiDs9sSMgHLIzX-LdeIhwhJcQeZp/view?usp=drivesdk" }
    ],

    core: [
      { title: "Core CS Bundle", link: "https://drive.google.com/drive/folders/1IGkTc-wTDR0gZLEsjW-VhJXZ8S7cJCda" },
      { title: "Core Subject DSA + HR", link: "https://drive.google.com/drive/folders/1u6rU69UWH8c4T1yOycrwm5-R1DRWX9fj" },
      { title: "HR Questions", link: "https://drive.google.com/drive/folders/149eO9qawR7t9Cn2_pJBHDL7iPus30o_s" },
      { title: "Development Roadmap + Projects", link: "https://drive.google.com/drive/folders/1_X8kNOELd1sm3gQSFbooxDsZE1oeI5vx" }
    ],

    aptitude: [
      { title: "Aptitude Notes 🔥", link: "https://drive.google.com/file/d/1uZJa72IvOYQXF6-jzayD4XcS5bfeHyru/view" },
      { title: "Aptitude PYQ", link: "https://drive.google.com/file/d/1OBC7Qn_bd9MCdSp7yq0lBC1eRxnKO5ZV/view" },
      { title: "Interview Hacks", link: "https://drive.google.com/drive/folders/1XPG0wHdoCWe-1ynf9ntrhUj_BmwQ9EvM" }
    ],

    certifications: [
      { title: "Google Certificates", link: "https://grow.google/certificates/" },
      { title: "Google Cloud Learn", link: "https://cloud.google.com/learn" },
      { title: "Skillshop", link: "https://skillshop.withgoogle.com/" },
      { title: "AWS Skill Builder", link: "https://aws.amazon.com/training/digital/" },
      { title: "AWS Educate", link: "https://aws.amazon.com/education/awseducate/" },
      { title: "Microsoft Learn", link: "https://learn.microsoft.com/en-us/training/" },
      { title: "Free Microsoft Student Exams", link: "https://aka.ms/student-certification" },
      { title: "Oracle Certifications", link: "https://academy.oracle.com/en/resources-oracle-certifications.html" },
      { title: "IBM Certifications", link: "https://www.pearsonvue.com/us/en/ibm.html" },
      { title: "Meta Certifications", link: "https://www.facebook.com/business/learn/certification" },
      { title: "Deloitte Academy", link: "https://www.deloitte.com/cy/en/services/deloitte-academy.html" },
      { title: "PayPal PCI Compliance", link: "https://www.paypal.com/in/webapps/mpp/pci-compliance" }
    ],

    // Fixed Hiring News Section
    hiring: [
      {
        company: "IBM",
        position: "Associate Developer",
        package: "Apply Now",
        skills: "Entry Level",
        link: "https://careers.ibm.com/en_US/careers/JobDetail?jobId=92086"
      },
      {
        company: "Deutsche Bank",
        position: "Software Engineer",
        package: "Apply Now",
        skills: "Entry Level",
        link: "https://careers.db.com/professionals/search-roles/?test.html%3Fkid%3D=linkedinjobwrap#/professional/job/68787"
      },
      {
        company: "Adobe",
        position: "Associate Technical Consultant",
        package: "Apply Now",
        skills: "Entry Level",
        link: "https://share.google/DDp6KnESajNlFjQlI"
      },
      {
        company: "Cisco",
        position: "Software Engineer Intern",
        package: "2028 graduates (females only)",
        skills: "Cisco Women Internship Program",
        link: "https://careers.cisco.com/global/en/job/2006873/Software-Engineer-Intern-Cisco-Women-Internship-Program"
      },
      {
        company: "Cognizant",
        position: "Software Engineer",
        package: "2025 graduates",
        skills: "Mass Hiring",
        link: "https://careers.cognizant.com/india-en/pathways-to-cognizant/genc-program/?fbclid=PAb21jcAP9G7lleHRuA2FlbQIxMABzcnRjBmFwcF9pZA8xMjQwMjQ1NzQyODc0MTQAAafuQcZrgPLHZNBrscKpSiwqL_4wqVFTSQMkJH_i8etSk0DO1tWQRvJG6MD-Rg_aem_LwkHzG4IXeZ6fLWMmYokdg"
      }
    ]
  };

  const filtered = category === "hiring" 
    ? data[category].filter(item =>
        `${item.company} ${item.position} ${item.skills} ${item.package}`.toLowerCase().includes(search.toLowerCase())
      )
    : data[category].filter(item =>
        item.title.toLowerCase().includes(search.toLowerCase())
      );

  return (
    <div className="app">
      <header>
        <h1>🚀 One Step Store</h1>
        <div className="top-controls">
          <input
            type="text"
            placeholder={category === "hiring" ? "Search jobs..." : "Search resources..."}
            value={search}
            onChange={(e) => setSearch(e.target.value)}
          />
          <button onClick={() => setDark(!dark)}>
            {dark ? "☀ Light" : "🌙 Dark"}
          </button>
        </div>
      </header>

      <nav>
        <button onClick={() => setCategory("home")}>Home</button>
        <button onClick={() => setCategory("company")}>Company</button>
        <button onClick={() => setCategory("core")}>Core CS</button>
        <button onClick={() => setCategory("aptitude")}>Aptitude</button>
        <button onClick={() => setCategory("certifications")}>Certifications</button>
        <button onClick={() => setCategory("hiring")}>🔥 Hiring News</button>
      </nav>

      <div className="cards">
        {category === "hiring" ? (
          // Fixed Hiring News Cards
          filtered.map((item, index) => (
            <div className="card hiring-card" key={index}>
              <div className="company-header">
                <h3 className="company-name">{item.company}</h3>
                <span className="package-badge">{item.package}</span>
              </div>
              <p className="position">{item.position}</p>
              <div className="skills-tags">
                <span className="skill-tag">{item.skills}</span>
              </div>
              <a href={item.link} target="_blank" rel="noreferrer">
                <button className="apply-btn">Apply Now →</button>
              </a>
            </div>
          ))
        ) : (
          // Regular Resource Cards
          filtered.map((item, index) => (
            <div className="card" key={index}>
              <h3>{item.title}</h3>
              <a href={item.link} target="_blank" rel="noreferrer">
                <button>Open</button>
              </a>
            </div>
          ))
        )}
      </div>
    </div>
  );
}

export default App;